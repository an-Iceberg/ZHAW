local title = io.open("title.txt")

-- Prints the fancy title
if title ~= nil then
  for line in title:lines("L") do
    io.write(line)
  end
end

local files = {}

for i = 1, 6, 1 do
  table.insert(files, {
    -- Opening all files
    file = io.open(string.format("source_%d.txt", i)),
    name = string.format("source_%d.txt", i),
    current_character = "",
    character_count = {},
    total_characters = 0,
    total_distinct_characters = 0,
    entropy = 0
  })
end

for _, file in pairs(files) do
  if file.file ~= nil then
    io.write(string.format("Running analysis on %s...\n", file.name))

    -- Going through all characters in the file and storing analytical data
    while true do
      -- Reads the next character (letter, symbol)
      file.current_character = file.file:read(1)

      -- End of file, end loop
      if file.current_character == nil then break end

      -- Ignores whitespaces and newlines
      if file.current_character ~= " " and file.current_character ~= "\n" then

        -- Increment total character count
        file.total_characters = file.total_characters + 1

        local has_letter_been_found = false
        -- Comparing the current character with every other character
        for letter, data in pairs(file.character_count) do

          -- An existing character has been found
          if file.current_character == letter then
            -- Updating count
            data.count = data.count + 1

            has_letter_been_found = true
            break
          end
        end

        -- A new character has been found
        if not has_letter_been_found then
          file.character_count[file.current_character] = {count = 1, probability = 0, information_content = 0}
          file.total_distinct_characters = file.total_distinct_characters + 1
        end
      end
    end

    -- Printing the results of the analysis
    for letter, data in pairs(file.character_count) do
      if letter == "\n" then letter = "\\n" end

      data.probability = data.count / file.total_characters
      data.information_content = math.log(1 / data.probability, 2)

      file.entropy = file.entropy + (data.probability * data.information_content)

      io.write(string.format(
        "\"%s\": %6d times,\tP(%s) = %f,\tI(%s) = %f\n",
        letter,
        data.count,
        letter,
        data.probability,
        letter,
        data.information_content
      ))
    end

    io.write(string.format("H(%s) = %f\n", file.name, file.entropy))

    io.write(string.format("%d characters with %d distinct symbols in %s.\n", file.total_characters, file.total_distinct_characters, file.name))

    io.write(string.format("Done analysis of %s. Closing file...\n\n", file.name))
    file.file:close()
  end
end

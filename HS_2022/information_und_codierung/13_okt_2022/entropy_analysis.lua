io.write([[

   ,ggggggg,                                                                                ,ggg,                                                                            ,ggggggggggggggg
 ,dP""""""Y8b               I8                                                             dP""8I                             ,dPYb,                                        dP""""""88"""""""                 ,dPYb,
 d8'    a  Y8               I8                                                            dP   88                             IP'`Yb                                        Yb,_    88                        IP'`Yb
 88     "Y8P'            88888888                                                        dP    88                             I8  8I                       gg                `""    88                        I8  8I
 `8baaaa                    I8                                                          ,8'    88                             I8  8'                       ""                       88                        I8  8'
,d8P""""      ,ggg,,ggg,    I8    ,gggggg,    ,ggggg,   gg,gggg,    gg     gg           d88888888    ,ggg,,ggg,     ,gggg,gg  I8 dP  gg     gg    ,g,      gg     ,g,               88   ,ggggg,    ,ggggg,   I8 dP
d8"          ,8" "8P" "8,   I8    dP""""8I   dP"  "Y8gggI8P"  "Yb   I8     8I     __   ,8"     88   ,8" "8P" "8,   dP"  "Y8I  I8dP   I8     8I   ,8'8,     88    ,8'8,              88  dP"  "Y8gggdP"  "Y8gggI8dP
Y8,          I8   8I   8I  ,I8,  ,8'    8I  i8'    ,8I  I8'    ,8i  I8,   ,8I    dP"  ,8P      Y8   I8   8I   8I  i8'    ,8I  I8P    I8,   ,8I  ,8'  Yb    88   ,8'  Yb       gg,   88 i8'    ,8I i8'    ,8I  I8P
`Yba,,_____,,dP   8I   Yb,,d88b,,dP     Y8,,d8,   ,d8' ,I8 _  ,d8' ,d8b, ,d8I    Yb,_,dP       `8b,,dP   8I   Yb,,d8,   ,d8b,,d8b,_ ,d8b, ,d8I ,8'_   8) _,88,_,8'_   8)       "Yb,,8P,d8,   ,d8',d8,   ,d8' ,d8b,_
  `"Y88888888P'   8I   `Y88P""Y88P      `Y8P"Y8888P"   PI8 YY88888PP""Y88P"888    "Y8P"         `Y88P'   8I   `Y8P"Y8888P"`Y88P'"Y88P""Y88P"888P' "YY8P8P8P""Y8P' "YY8P8P        "Y8P'P"Y8888P"  P"Y8888P"   8P'"Y88
                                                        I8               ,d8I'                                                            ,d8I'
                                                        I8             ,dP'8I                                                           ,dP'8I
                                                        I8            ,8"  8I                                                          ,8"  8I
                                                        I8            I8   8I                                                          I8   8I
                                                        I8            `8, ,8I                                                          `8, ,8I
                                                        I8             `Y8P"                                                            `Y8P"
]])

-- Opening all files
local files = {
  io.open("source_1.txt"),
  io.open("source_2.txt"),
  io.open("source_3.txt"),
  io.open("source_4.txt"),
  io.open("source_5.txt"),
  io.open("source_6.txt"),
}

for file_name, file in pairs(files) do
  if file ~= nil then
    io.write("Source file "..file_name.." Analysis running...\n")

    local character_frequency = {}
    local total_characters = 0

    -- Going through all characters in the file and storing analytical data
    local character
    while true do
      character = file:read(1)
      -- End of file, end loop
      if character == nil then break end

      total_characters = total_characters + 1

      local has_letter_been_found = false
      -- Comparing the current character with every other character
      for letter, frequency in pairs(character_frequency) do

        -- An existing character has been found
        if character == letter then
          -- Updating count
          character_frequency[letter] = frequency + 1

          has_letter_been_found = true
          break
        end
      end

      -- A new character has been found
      if not has_letter_been_found then
        character_frequency[character] = 1
      end
    end

    -- Printing the results of the analysis
    for letter, frequency in pairs(character_frequency) do
      if letter == "\n" then letter = "\\n" end

      io.write("\""..letter.."\"".." occured "..frequency.." times\n")
    end

    io.write("Total number of characters in Source "..file_name..": "..total_characters.."\n")

    io.write("Done analysis of file "..file_name..". Closing file...\n\n")
    file:close()
  end
end

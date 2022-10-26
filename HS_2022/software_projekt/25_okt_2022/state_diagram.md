# :warning: Subject to change :warning:

:::mermaid
stateDiagram-v2
direction TB

prompt : Prompting for user input
read : Reading/Processing user input
processing : Is user input valid? (Command and numbers)
exec : Executing a command

[*] --> prompt : program start
prompt --> read : user has entered input
read --> processing
read --> prompt : illegal input (ex. not a command)
processing --> prompt : false, notify user
processing --> exec : true
exec --> prompt
exec --> [*] : EXIT command, terminating program
:::

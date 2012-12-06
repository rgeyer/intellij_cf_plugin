# Description

This is an IntelliJ IDEA 10.5 Ultimate plugin to support the RightScale CloudFlow definition language.

It'll probably work on other IntelliJ family IDE's as well.

# Features
* Identifies CloudFlow definitions by the file extension *.def
* Displays *.def files with a RightScale icon
* Basic syntax highlighting in the editor

# Developer Usage & Contributing

## Stuff you need to know
Use the cloudflow_dsl.xml ant build file to build things, there are some dependencies which it handles which I'll describe here.

There is a "Cloudflow.flex" file which gets processed by JFlex to create _CloudflowLexer.java.  You can find it as the generate.cloudflow.lexer task in the ant build file.

# Distribution

Run the plugin.build.zip.cloudflow to generate a new cloudflow.zip file containing everything you need to unzip into your ~/IDEA/plugins directory to install the plugin

# TODO
* Improved Syntax Highlighting
  * Differentiate between variables and resources
  * Identify built-in functions
  * Identify operators
* Add syntax tree lexing (identify block start/end etc)
* Add a menu option to validate a definition using the API
* Add a menu option to execute a definition, including identifying/supplying inputs.
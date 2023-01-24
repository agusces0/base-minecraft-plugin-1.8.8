# base-minecraft-plugin-1.8.8/1.19.2

A base spigot Minecraft plugin created with Maven. 
This includes pom.xml, McPluginMaven.java & plugin.yml configured to run in my PC, you have to change some things to make it run properly, here you have a guide to do it:
  
  pom.xml includes spigot api 1.8.8 but you can make it run with the version you want just by replacing <version>1.8.8-R0.1-SNAPSHOT</version>
  also it's configured to have a custom output directory for your plugin, make sure to CHANGE target direction "<outputDirectory>C:\YOURS</outputDirectory>"
  
  plugin.yml have an easy configuration, you mainly only have to change "name" to yours and "main" with the path to your plugin java class

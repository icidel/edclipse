# Introduction #

The Edclipse plugin is generated with the XText library. So if you want to contribute to this project you will have to follow the steps shown below in order to install the appropriate Eclipse distribution and setup the workspace.

# What do I need ? #

The easy way is to download the "Eclipse 3.5.1 (Galileo) + TMF Xtext 0.7.2" from http://xtext.itemis.com/xtext/language=en/23947/downloads .

Then just create a workspace with your Eclipse distribution and import the Edclipse projects from SVN with the "SVN explorer" perspective.

If you already have an updated Eclipse setup, you can use the "target platform" properties to point to the "Eclipse 3.5.1 (Galileo) + TMF Xtext 0.7.2" setup.
This way you can use even Beta Eclipse versions without compromising compatibility on plugin build, but you will have to dig a little to understand what "target platform" means and how to use it.

# Now how to get started ? #

On SVN you will find 3 Eclipse projects under the subproject "edc\_file\_editor\_plugin".

- The project "org.xtext.enlightenment.edje" contains the grammar 'Edje.xtext" and the runtime setup of the EDC language.

- The project "org.xtext.enlightenment.edje.ui" contains the generated User Interface elements like editor, outline view and code completion.

- The project "org.xtext.enlightenment.edje.generator" contains the code generator.


Currently the only file which has been modified is the "edje.xtext" file. This file contains the grammar which describes the source code model.

when you update any file in the "src" folder you will have to generate the src-gen files by doing a right click on the "GenerateEdje.mwe" file and choosing "Run as... MWE workflow".

Do not change any file in the src-gen folder : it will be overwritten on the next generator call !

# And how to test the generated plugin ? #

Just do a right click on the "plugin.xml" file and choose "Run as... Eclipse application".

A new Eclipse instance will open : simply choose to create a new file and set its extension to ".edc". Now you will have syntax coloring, syntax error handling and so on..

Quite great for a single file setup and some generated code, isn't it ?
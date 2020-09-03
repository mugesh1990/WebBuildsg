This file contains instructions on how to set up your Eclipse environment to
work with the source code for the Google Plugin for Eclipse:

Configuring Your Eclipse Workspace
==================================

Configuring your Eclipse workspace to develop on the Google Eclipse plugin is very
much like getting set up to develop for webbuildsg. The same style rules apply, and
Eclipse projects are provided for you to import. The "settings" directory
mentioned below is under "eclipse", in your checkout of plugin.

Macintosh users: Note that on the Macintosh version of Eclipse, "Preferences"
is under the "Eclipse" menu, not under "Window".



------------- Text Editors ----------------

Window->Preferences->General->Editors->Text Editors
Make sure that "Displayed Tab Width" is set to 4
Enable "Insert Spaces for Tabs"
Enable "Show Print Margin" and set "Print Margin Column" to 80

------------- XML Files -------------------

Window->Preferences->Web and XML->XML Files->Source
(or Window->Preferences->XML->XML Files->Editor, if you can't find it there)
Set "Line Width" 80
Enable "Split Multiple Attributes Each of a New Line"
Enable "Indent Using Spaces" with an Indentation Size of 4

------------- Ant Build Files -------------

Window->Preferences->Ant->Editor->Formatter
Set "Tab Size" to 4
Disable "Use Tabs Instead of Spaces"
Set "Maximum Line Width" to 80
Enable "Wrap Long Element Tags"

---------------- Spelling -----------------

Window->Preferences->General->Editors->Text Editors->Spelling
Enable spell checking
Use "settings/english.dictionary".

----------- Code Templates ----------------

Window->Preferences->Java->Code Style->Code Templates

Comments->Files template should look like this:

/*
 * Copyright ${year} Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

Comments->Types template should look like this:

/**
 *
 * ${tags}
 */

---------- Save Actions -------------------

Window->Preferences->Java->Editor->Save Actions

Enable "Perform the Selected Actions on Save"
Enable "Format Source Code"
Enable "Organize Imports"
Enable "Additional Actions"
Click "Configure", and make sure that all actions are disabled except "Sort Members Excluding fields, enum constants, and initializers"

---------- Code style/formatting ----------

Window->Preferences->Java->Code Style->Formatter->Import...
  settings/code-style/gwt-format.xml

----------- Import organization -----------

Window->Preferences->Java->Code Style->Organize Imports->Import...
  settings/code-style/gwt.importorder

------------ Member sort order ------------

Window->Preferences->Java->Appearance->Members Sort Order
There is no import here, so make your settings match:
  settings/code-style/gwt-sort-order.png

First, members should be sorted by category.
1) Types
2) Static Fields
3) Static Initializers
4) Static Methods
5) Fields
6) Initializers
7) Constructors
8) Methods

Second, members in the same category should be sorted by visibility.
1) Public
2) Protected
3) Default
4) Private

Third, within a category/visibility combination, members should be sorted
alphabetically.




== Importing the Google Plugin projects ==

Having set up your workspace appropriately, you can now import the appropriate
projects.

File -> Import -> General -> Existing Projects into Workspace

Select your checkout of the trunk of Google Eclipse Plugin to see all of the
Eclipse projects for you to import. You should only import the projects that
correspond to the version of Eclipse that you are using for development, and
the platform you are running on. For example, if you have Eclipse 3.4, do not
import a project that has "3.3" in its name. As another example, if you are
running on Windows, do not import projects that have readme "win32" or "macosx"
in their name. 

== Launching the Plugin ==

Once your projects have been imported, go to the Package Explorer and
right-click on the "srt/test/java" -> com.runnable-->TestRunnable.java. Go to 
"Run As" > "Junit Test".  Another instance of Eclipse should launch,
running !



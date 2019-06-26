![GWT image](https://avatars2.githubusercontent.com/u/4151804?s=280&v=4)

PROGRESS
-----
Coding Client side


NOTES
------
GWT Tools
- Cross-compile Java code -> highly optimized JS

File tree
--------
StockWatcher.html <-- Host page
	- Dynamic elements are created inside HTML `<div>` elemets
	- Quirks Mode and Standards Mode
StockWatcher.java <-- GWT entry point class
	- Implements EntryPoint interface
		- This contains onModuleLoad(is called when program starts)
StockWatcher.gwt.xml <-- Definition for module, resources...

Design requirements
------
DYNAMIC ELEMENTS
- Table for stock data
- Two buttons
- Input box for stock code
- Timestamp for last refresh<br>
STATIC ELEMENTS
- Logo
- Header


GWT Widgets
----

- FlexTable widget
	- Creates cells on demand. A table to hold the stock data !
- Button widget
	- Two buttons, one to add stocks and one to remove them 
- TextBox widget
	- An input box to enter the stock code 
- Label widget
	- A timestamp to show the time and date of the last refresh 

GWT Panels
-----
- Panels can be nester within other panels. 
- Vetrical Panel and Horizontal Panel
- Root panel
	- Container for dynamic elements
	- Not visible for user
	- At top of GWT user interface hierarchy
	- Two ways of usage
		- Generate entire body of the page
		- Generate specific elements embedded in the body
	- As default wraps the `<body>` element
	`RootPanel.get("stockList")` //Wraps given HTML element with id="stockList"
	`RootPanel.get()` //Default. Wraps the HTML body element
	- Host page can contain multiple Root Panels. Each Root Panel can hold GWT widgets independently of the others.
	- Using `<div>`element for implementation strategy is usefull for embedding GWT into an axisting application.
	- All GWT widgets or panels to work, they must be contained within a Root panel.
	- Associate panels with Root Panel should happen end of onModuleLoad() to ensure your application will work correnctly
- GWT and AJAX developement allows you to see code changes as soon you refresh 	  your page!
	- Running GWT application in developement mode allows us harness this feature 



Event requirements
----
- Remove row from table
- Create delete button

Events 
----

- Events in GWT use the event handler interface model similiar to other user interface frameworks
- Using anynomous inner classes usefull for small projects wiht minimal coding. In bigger projects no no!


Debug
---
- Possible to debug Java source code before compiling into JS
- Eclipse GWT debugging using different debugger

Ranodom
------
- GWT compiler bundles all the static resources. <-- Automatic Resource Inclusion
- in GWT each class of widget has own 
- StockWatcher.css define spesific style for StockWatcher
	-We can assing css #class styles to GWT dynamic elements
- Chrome refresh is ctrl+f5
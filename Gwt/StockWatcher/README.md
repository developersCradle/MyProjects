PROGRESS
-----
3rd part


NOTES
------
GWT Tools
- Cross-compile Java code -> highly optimized JS

File tree(some)
--------
StockWatcher.html <-- Host page
	- Dynamic elements are created inside HTML <div> elemets
	- Quirks Mode and Standards Mode
StockWatcher.java <-- GWT entry point class
	- Implements EntryPoint interface
		-This contains onModuleLoad(is called when program starts)
StockWatcher.gwt.xml <-- Definition for module, resources...

Design requirements
------
DYNAMIC ELEMENTS
- Table for stock data
- Two buttons
- Input box for stock code
- Timestamp for last refresh
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
	-A timestamp to show the time and date of the last refresh 

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
	- As default wraps the <body> element
	`RootPanel.get("stockList")` //Wraps given HTML element with id="stockList"
	`RootPanel.get()` //Default. Wraps the HTML body element
	- Host page can contain multiple Root Panels. Each Root Panel can hold GWT widgets independently of the others.
	- Using <div> element for implementation strategy is usefull for embedding GWT into an axisting application.
	- All GWT widgets or panels to work, they must be contained within a Root panel.
- GWT and AJAX developement allows you to see code changes as soon you refresh 	  your page!
	- Running GWT application in developement mode allows us harness this feature 
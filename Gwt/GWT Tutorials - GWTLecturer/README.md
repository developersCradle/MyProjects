![GWT image](https://i.ytimg.com/vi/xN2QYMJosGc/hqdefault.jpg?sqp=-oaymwEXCNACELwBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLDBCzmf51Bm2BJpNynWvIEHAEhrdQ)

GWT tutorial series.

Notes
===========

GWT Tutorial 2.0 - Remote Procedure Calls (RPC) with GWT
https://www.youtube.com/watch?v=Hd5vnHNylB8
---------------------------------------------

- Communicate between Client and Server using Remote Procedure Call (RPC)
- RPC -> Making RPC Call is like invoking a method in a class located on a server.




The trouble with RPC
--------------------

- AJAX, or Javascript, runs in your web browser.
- Browser is single threaded
	- Meaning, if you make a RPC call, your browser will hang until a response is received.
	- To avoid the browser hanging, a GWT RPC call is made "Asynchronous".
	- When making Asynchronous calls, the browser does not hang while waiting for a response.


- Async methods doesn't never return value(void value) -> Values are coming back with callbacks!

![RPC implementation pic](#)

-----------------------------
GWT Tutorial 2.1 - Remote Procedure (RPC) Calls with Complex Datatypes
url here
------------------------------



## Progress

- [ ] GWT Tutorial 0.1 - Installing, and debugging with, Eclipse
- [ ] GWT Tutorial 0.2 - Installing the GWT Plugin in Eclipse
- [ ] GWT Tutorial - 0.3 - Using GWT Super Dev Mode to Run and Debug GWT Projects
- [ ] GWT Tutorial 1.0 - Basics of GWT and GUI Building
- [ ] GWT Tutorial 1.1 - Proper Architecture for GWT GUI Building
- [x] GWT Tutorial 2.0 - Remote Procedure Calls (RPC) with GWT
- [ ] GWT Tutorial 2.1 - Remote Procedure (RPC) Calls with Complex Datatypes
- [ ] GWT Tutorial 2.2 - Remote Procedure Calls (RPC) with Complex Datatypes - Part 2
- [ ] GWT Tutorial 2.3 - Easy Error Handling with Remote Procedure Calls (RPC)

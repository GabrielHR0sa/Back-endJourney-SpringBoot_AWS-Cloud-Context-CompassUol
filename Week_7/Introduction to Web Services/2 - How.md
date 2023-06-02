<h1 align="center">Important How Questions related to Web Services</h1>

Web Services need to be independent of the platform
they should be in formats that are supported by all of different kinds of platforms

    
                ->   Request   ->
    Application                  Web Services
                <-   Response  <-

<br>
There are two formats for request and response
<li>First one is XML (extensive markup lenguage)
    
    <getCourseDetailsRequest>
        <id>Course1</id>
    </getCourseDetailsRequest>

<li>The other format is JSON (javascript object notation)

    [
        {
            "id" : 1,
            "name" : "Even",
            "birthDate" : "2017-07-10T07:52:48.270+000"
        }
         {
            "id" : 2,
            "name" : "Abe",
            "birthDate" : "2017-07-10T07:52:48.270+000"
        }
    ]

<br>

Service Definition specifies the:

<li>Request/Response format
<li>Request Structure
<li>Response Structure
<li>Endpoint
                 
    
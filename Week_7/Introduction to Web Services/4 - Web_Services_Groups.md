<h1 align="center">Introduction to SOAP Web Services</h1>

Web Service Groups
<li>SOAP-based
<li>REST-styled

    SOAP and REST are not really comparable

<h2 align="center">SOAP (Simple object access protrocol)</h2>


In Soap we use XML format to request and response

to do a request we need to follow this 

    SOAP-ENV: Envelope
    SOAP-ENV: Header
    SOAP-ENV: body

the header contains meta-informations like authentication, autorization, signatures 

the body is where you put te content of your request or your response

<br>

An exemple of response as a SOAP:
    
    <SOAP-ENV:Envelope xmlns:SOAP-ENV="https://schemas.xmlsoap.org/>
        <SOAP-ENV:Header/>
        <SOAP-ENV:Body>
            <ns2:getCourseDetailsResponse xmlns:ns2="https://in28mi>
                <ns2course>
                    <ns2:id>Course1</ns2:id>
                    <ns2:name>Spring</ns2:name>
                    <ns2:description>10 Steps</ns2:description>
                </ns2course>
            <ns2:getCourseDetailsResponse>
        <SOAP-ENV:Body>
    <SOAP-ENV:Envelope>

SOAP

Format
    <li>SOAP XML Request
    <li>SOAP XML Response

Transport
    <li>SOAP over MQ
    <li>SOAP over HTTP

Service
    <li>WSDL - Web Service Definition Language

<hr>

<h2 align="center">Rest (Representational State Transfer)</h2>

Http - hyper text transfer protocol

methods - GET, POST, PUT...

status codes - 200, 404...

RESTful Web Services try to define services using the different concepts that already present in http

The Most important abstraction in REST is something called resource

<li> RESOURCE

    A resource has an URI (Uniform Resouce Identifier)
     . /user/Ranga/todos/1
     . /user/Ranga/todos/1
     . /user/Ranga
    A resource can have different representations
     . XML
     . HTML
     . JSON

EXAMPLE
    
    . Create a user - POST/user
    . Delete a user - DELETE/user/1
    . Get all users - GET/users
    . Get one users - GET/users/1


REST

Data Exchange Format
    <li>No Restriction.JSON is popular

Transport
    <li>Only HTTP

Service Definition
        <li>No Standard.WADL/Swagger/...
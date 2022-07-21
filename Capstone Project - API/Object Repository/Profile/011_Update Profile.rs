<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>011_Update Profile</name>
   <tag></tag>
   <elementGuidId>d292e9cc-cd62-4b4c-b423-9ac3c0dbb96d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;phone_number\&quot; : \&quot;0821128080\&quot;,\n  \&quot;date_of_birth\&quot; : \&quot;01-01-1999\&quot;,\n  \&quot;gender\&quot; : \&quot;MALE\&quot;,\n  \&quot;role\&quot; : \&quot;Customer Service\&quot;,\n  \&quot;status\&quot; : \&quot;FullTime\&quot;,\n  \&quot;address\&quot; : \&quot;Jalan Tan Malaki\&quot;,\n  \&quot;employee_id\&quot; : \&quot;123456\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ac55d98b-c857-4d52-9d04-3fdcdc0eb721</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6W3siaWQiOjIsIm5hbWUiOiJST0xFX0FETUlOIn1dLCJlbWFpbCI6ImFkbWluMkBnbWFpbC5jb20iLCJpYXQiOjE2NTc2MDkwNzYsImV4cCI6MTY1ODQ3MzA3Nn0.-GQu4KGkJzaUFXR9qj6HeWVqoKs3Tk4cSdY5KDFpeJg</value>
      <webElementGuid>297e8c6a-b19b-4c1e-babe-673fd3c228e6</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://54.227.80.34/api/auth/profile</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

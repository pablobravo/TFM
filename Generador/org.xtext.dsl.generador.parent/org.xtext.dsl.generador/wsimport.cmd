cls
cd %~dp0
cd src
java -Djavax.xml.accessExternalSchema=all -jar ..\tools\wsimport\jaxws-tools.jar -Xnocompile -extension -XadditionalHeaders -p ws.parafarmacia.webservice http://localhost:8800/WS.Parafarmacia/parafarmacia?wsdl
pause
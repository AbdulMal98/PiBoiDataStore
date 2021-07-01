import base64

import requests

user: str = "Mal"
password: str = "MGSgQYPRuI"


def postAtp(temperature, pressure, altitude, timestamp):
    datadict = {"timestamp": timestamp, "altitude": altitude, "temperature": temperature, "pressure": pressure}
    r = requests.post("http://localhost:8080", json=datadict, headers=getBasicAuthHeader())
    print(r.status_code)


def getBasicAuthHeader():
    return {"Authorization": base64.b64encode(user + ":" + password)}

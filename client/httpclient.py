import requests


def postAtp(temperature, pressure, altitude, timestamp):
    datadict = {"timestamp": timestamp, "altitude": altitude, "temperature": temperature, "pressure": pressure}
    r = requests.post("http://localhost:8080", json=datadict)
    print(r.status_code)

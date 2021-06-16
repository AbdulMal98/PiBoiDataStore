import bme280
import schedule
import time
import datetime

(chip_id, chip_version) = bme280.readBME280ID(0x76)

PRESSURE_AT_SEA_LEVEL = 1013.25
STANDARD_LAPSE_RATE = 0.0065


def calculateAltitudeFromHypsometric(currentPressure, currentCelsius):
    # See Hypsometric Equation for more information
    current_kelvin = currentCelsius + 273.15
    numerator = ((PRESSURE_AT_SEA_LEVEL / currentPressure) ** (1 / 5.257) - 1) * current_kelvin
    return numerator / STANDARD_LAPSE_RATE


def getTimestamp():
    now = datetime.datetime.now()
    print(now)


def stats(temperature, pressure, humidity):
    print("temperature : ", temperature, "C")
    print("pressure : %.3f" % pressure + " hPa")
    print("altitude : %.3f" % calculateAltitudeFromHypsometric(pressure, temperature) + " m")
    print("timestamp : ", getTimestamp())


def readAtpData():
    while True:
        temperature, pressure, humidity = bme280.readBME280All()
        stats(temperature, pressure, humidity)
        time.sleep(10)

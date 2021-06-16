from reader import bme280
from reader.atp_reader import readAtpData


def main():
    (chip_id, chip_version) = bme280.readBME280ID()
    print("Chip ID     :", chip_id)
    print("Version     :", chip_version)

    readAtpData()


if __name__ == "__main__":
    main()

package com.codeappeal.soserial

class TroubleHelper {

    static void persistGadget(String fileName, String commandValue) {
        Command command = new Command(commandValue)
        Gadget gadgetObject = new Gadget(command)
        FileOutputStream fileOut = new FileOutputStream(fileName)
        ObjectOutputStream out = new ObjectOutputStream(fileOut)
        out.writeObject(gadgetObject)
        out.close()
        fileOut.close()
    }

    static PerfectlyValidObject load(String fileName) {
        FileInputStream fileIn = new FileInputStream(fileName)
        ObjectInputStream input = new ObjectInputStream(fileIn)
        PerfectlyValidObject validObject = (PerfectlyValidObject) input.readObject()
        return validObject
    }

}

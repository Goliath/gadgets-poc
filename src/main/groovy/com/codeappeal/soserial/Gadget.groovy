package com.codeappeal.soserial

class Gadget implements Serializable {

    private Runnable command

    Gadget(Command command) {
        this.command = command
    }

    private final void readObject(ObjectInputStream input) throws IOException, ClassNotFoundException {
        input.defaultReadObject()
        command.run()
    }
}
package com.codeappeal.soserial

public class Command implements Runnable, Serializable {

    private String command

    public Command(String command) {
        this.command = command
    }

    @Override
    public void run() {
        try {
            println Runtime.getRuntime().exec(command).text
        } catch (IOException e) {
            throw new RuntimeException(e)
        }
    }
}

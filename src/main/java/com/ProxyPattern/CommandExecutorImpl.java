package com.ProxyPattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) {
        //some heavy implementation
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("'" + cmd + "' command executed.");
    }
}

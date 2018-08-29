package com.ProxyPattern;

public class CommandExecutorProxy implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String password){

        if("Pankaj".equals(user) && "J@urnalD$v".equals(password)) isAdmin=true;
        commandExecutor = new CommandExecutorImpl();
    }


    @Override
    public void runCommand(String cmd){
        if(isAdmin){
            commandExecutor.runCommand(cmd);
        }else{
            if(cmd.trim().startsWith("rm")){
                //throw new Exception("rm command is not allowed for non-admin users.");
            }else{
                commandExecutor.runCommand(cmd);
            }
        }
    }
}

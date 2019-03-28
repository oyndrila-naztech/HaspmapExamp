package com.java.hashmap;

public class Empname {

	
	public String vmName;
    private String platform;
    public int memory;

    public Empname() {
		// TODO Auto-generated constructor stub
	}

    public Empname(String name, int memory) {
    	this.vmName = name;
    	this.memory = memory;
	}

	

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	String getName(){
        return vmName;
    }

    void setPlatform(String p){
        platform = p;
    }

    String getPlatform(){
        return platform;
    }

    void setMemory(int m){
        memory = m;
    }

    int getMemory(){
        return memory; 
        
    }

	@Override
	public String toString() {
		return "Empname [vmName=" + vmName + ", platform=" + platform + ", memory=" + memory + "]";
	}
	
}


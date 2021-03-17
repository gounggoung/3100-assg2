package sim;

public class Job {
    public int submitTime;
    public int jobID;
    public int estRuntime;
    public int core;
    public int memory;
    public int disk;

    Job(int submitTime, int jobID, int estRuntime, int core, int memory, int disk) {
        this.submitTime = submitTime;
        this.jobID = jobID;
        this.estRuntime = estRuntime;
        this.core = core;
        this.memory = memory;
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "SubmitTime:" + submitTime + " JobID:" + jobID + " EstRuntime:" + estRuntime + " Core:" + core + " Memory:" + memory + " Disk:" + disk;
    }
}

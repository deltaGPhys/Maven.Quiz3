package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> labs;

    public Student() {
        this(null);
        this.labs = new ArrayList<Lab>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = this.getLab(labName);
        if (lab == null) {
            throw new UnsupportedOperationException();
        }
        lab.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        this.labs.add(lab);

    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = this.getLab(labName);
        return lab.getStatus();
    }

    public String toString() {
        String output = "";
        for (int i = labs.size()-1; i >= 0; i--) {
            output += labs.get(i).getName() + " > " + labs.get(i).getStatus().toString()+"\n";
        }
        return output.substring(0,output.length()-1);
    }
}

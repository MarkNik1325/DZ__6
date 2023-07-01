package DZ_6;

import java.util.Objects;
public class Nout {
   private int ram;
   private int hdd;
   private String OS;
   private  String Color;
   private String  Model;

   private  int id;

   public Nout ( int id){
       this.ram = ram;
       this.hdd = hdd;
       this.OS = OS;
       this.Color = Color;
       this.Model = Model;
   }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return Color;
    }

    public String getModel() {
        return Model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nout nout = (Nout) o;
        return ram == nout.ram && hdd == nout.hdd && Objects.equals(OS, nout.OS) && Objects.equals(Color, nout.Color) && Objects.equals(Model, nout.Model);
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdd, OS, Color, Model);
    }

    @Override
    public String toString() {
        return "Laptop" +  id + "{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", OS='" + OS + '\'' +
                ", Color='" + Color + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}



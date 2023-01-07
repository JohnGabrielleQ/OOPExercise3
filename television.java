public class Television {
private String color;
private Remote remote;

public Television(String color){
this.color = color;
remote = new Remote();

public void setBrand(String brand){
this.color = color;



public String powerOn(){
return remote.powerOn();

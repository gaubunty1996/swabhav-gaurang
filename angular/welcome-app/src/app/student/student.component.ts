import { Component } from '@angular/core';
import {IStudent} from './IStudent';
@Component({
  selector: 'sw-student',
  templateUrl:'./student.component.html'
 // styleUrls: ['./student.component.css']
})
export class StudentComponent {
  
  private student:IStudent;
  public imgsrc:String="../../assets/2.png";
  
  public message:String=" inside paragraph";
  public imgWidth:Number=500;
  public imgHeight:Number=80;
  public color1:String="red";
  public color2:String="green";

  public get getCgpaColor(){
     if(this.student.cgpa>7){
      return "green";
     }
     else{
      return "red";
     }
     return 0;
  }
  public arraylist:String[]=[];
  public buttonEvent(){
    alert("button clicked")
    
    this.arraylist.push("Algebra");
    this.arraylist.push("Game Designing");
    this.arraylist.push("Python");
    this.arraylist.push("History");

  }

  constructor(){
    this.student={
      cgpa:7,
      studentName:'Gaurang',
      Job:'Software developer',
      company:'AurionPro'

    }

  }
}
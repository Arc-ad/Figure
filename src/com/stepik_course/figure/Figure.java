package com.stepik_course.figure;

public abstract class Figure {
   private String name;

   public Figure(){
      this.name = "";
   }

   public Figure(String name){
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Figure{" +
              "name='" + getClass().getSimpleName() + '\'' +
              '}';
   }
}

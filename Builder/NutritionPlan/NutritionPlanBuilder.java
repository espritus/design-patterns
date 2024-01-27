package project.com;

import java.util.*;

public class NutritionPlanBuilder {
    private static NutritionPlan np;

    private int dailyCaloricIntake;
    private int carb;
    private int prot;
    private int fat;
    private List<String> mealPlan;
    private String fitnesGoal;               //"weight loss", "weight gain", "maintenance"
    private List<String> dietaryRestr;

    public void setCaloricIntake(int calorie){
        this.dailyCaloricIntake = calorie;
    }
    public void setMacronutrientRatios(int carb, int prot, int fat){
        this.carb = carb;
        this.prot = prot;
        this.fat = fat;
    }
    public void setMealPlans(List<String> plan){
        this.mealPlan =plan;
    }
    public void setFitnessGoal(String type){
        this.fitnesGoal = type;
    }
    public void setDietaryRestrictions(List<String> rest){
        this.dietaryRestr = rest;
    }

    public NutritionPlan build(){
        return np;
    }
}

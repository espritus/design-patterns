package project.com;

import java.util.ArrayList;
import java.util.List;

public class WeightGainNutritionPlanBuilder extends NutritionPlanBuilder{
    //private static NutritionPlan np;

    private int dailyCaloricIntake;
    private int carb;
    private int prot;
    private int fat;
    private List<String> mealPlan;
    private String fitnesGoal;               //"weight loss", "weight gain", "maintenance"
    private List<String> dietaryRestr;

    @Override
    public void setCaloricIntake(int calorie){
        this.dailyCaloricIntake = calorie;
    }

    @Override
    public void setMacronutrientRatios(int carb, int prot, int fat){
        this.carb = carb;
        this.prot = prot;
        this.fat = fat;
    }
    @Override
    public void setMealPlans(List<String> plan){
        this.mealPlan =plan;
    }
    @Override
    public void setFitnessGoal(String type){
        this.fitnesGoal = type;
    }
    @Override
    public void setDietaryRestrictions(List<String> rest){
        this.dietaryRestr = rest;
    }
    @Override
    public NutritionPlan build(){
        List<String> mealp = new ArrayList<>();
        List<String> rest = new ArrayList<>();
        rest.add("gluten-free");
        mealp.add("Breakfast:vegetables");
        mealp.add("Lunch:chicken");
        setFitnessGoal("Dinner:Weight Gain");
        setMealPlans(mealp);
        setCaloricIntake(3500);
        setMacronutrientRatios(20,13,30);
        return new NutritionPlan(dailyCaloricIntake,carb,prot,fat, mealPlan, fitnesGoal,  dietaryRestr);
    }
}

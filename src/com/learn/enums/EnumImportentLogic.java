//$Id$
package com.learn.enums;
	
	public class EnumImportentLogic {
	    interface SeasonInt {
	        String seasonDuration();
	    }

	    private enum Season implements SeasonInt {
	        // except the enum constants remaining code looks same as class
	        // enum constants are implicitly public static final we have used all caps to specify them like Constants in Java
	        WINTER(88, "DEC - FEB"), SPRING(92, "MAR - JUN"), SUMMER(91, "JUN - AUG"), FALL(90, "SEP - NOV");

	        private int days;
	        private String months;

	        Season(int days, String months) { // note: constructor is by default private 
	            this.days = days;
	            this.months = months;
	        }

	        @Override
	        public String seasonDuration() {
	            return this+" -> "+this.days + "days,   " + this.months+" months";
	        }

	    }
	    public static void main(String[] args) {
	        System.out.println(Season.SPRING.seasonDuration());
	        for (Season season : Season.values()){
	            System.out.println(season.seasonDuration());
	        }

	    }
	}

package com.Marks;

public  class StudentMarks {
        private int maths;
        private int physics;
        private int chemistry;
        private int biology;
        private double businessStudies;
        private int finance;
        private int accounting;
        public int calculateMarks(int maths,int physics,int chemistry,int biology)
        {
            int sum=maths+physics+chemistry+biology;
            return sum;
        }
        public int calculateMarks(int maths,int physics, int chemistry)
                {
            int sum=maths+physics+chemistry;
            return sum;
        }
        public int calculateMarks(double businessStudies,int finance, int accounting )
        {
            int sum= (int) (businessStudies+finance+accounting);
            return sum;
        }
    }


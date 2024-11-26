public class QuizRisk {
    public enum RiskCategory {
        NORMAL, RISK, HIGH_RISK
    }

    public enum HighRiskLevel {
        LEVEL_0, LEVEL_1, LEVEL_2, LEVEL_3
    }

    public static class Patient {
        private int age;
        private double bloodPressure;
        private double bloodSugar;

        public Patient(int age, double bloodPressure, double bloodSugar) {
            this.age = age;
            this.bloodPressure = bloodPressure;
            this.bloodSugar = bloodSugar;
        }

        public boolean isTargetAgeGroup() {
            return age >= 15 && age <= 65;
        }

         public RiskCategory getBloodPressureCategory() {
            if (bloodPressure <= 120) return RiskCategory.NORMAL;
            if (bloodPressure > 120 && bloodPressure < 138) return RiskCategory.RISK;
            return RiskCategory.HIGH_RISK;
        }

        public HighRiskLevel getBloodPressureSeverity() {
            if (bloodPressure <= 139) return HighRiskLevel.LEVEL_0;
            if (bloodPressure >= 140 && bloodPressure <= 159) return HighRiskLevel.LEVEL_1;
            if (bloodPressure >= 160 && bloodPressure <= 179) return HighRiskLevel.LEVEL_2;
            return HighRiskLevel.LEVEL_3;
        }

        public RiskCategory getBloodSugarCategory() {
            if (bloodSugar < 100) return RiskCategory.NORMAL;
            if (bloodSugar >= 100 && bloodSugar < 125) return RiskCategory.RISK;
            return RiskCategory.HIGH_RISK;
        }

        public HighRiskLevel getBloodSugarSeverity() {
            if (bloodSugar <= 125) return HighRiskLevel.LEVEL_0;
            if (bloodSugar >= 125 && bloodSugar <= 154) return HighRiskLevel.LEVEL_1;
            if (bloodSugar >= 155 && bloodSugar <= 182) return HighRiskLevel.LEVEL_2;
            return HighRiskLevel.LEVEL_3;
        }

        public void analyzeHealthRisk() {
            if (!isTargetAgeGroup()) {
                System.out.println("Not in the target age group");
                return;
            }
        
            System.out.println("Patient Information:");
            System.out.println("Age: " + age + " years");
            System.out.println("Blood Pressure: " + bloodPressure + " mmHg");
            System.out.println("Blood Sugar: " + bloodSugar + " mg/dl");
            
            System.out.println("\nAnalysis Results:");
            System.out.println("Blood Pressure Category: " + getBloodPressureCategory());
            System.out.println("Blood Pressure Severity: " + getBloodPressureSeverity());
            System.out.println("Blood Sugar Category: " + getBloodSugarCategory());
            System.out.println("Blood Sugar Severity: " + getBloodSugarSeverity());
        }        
    }


    public static void main(String[] args) {
        Patient patient = new Patient(16, 120, 130);
        patient.analyzeHealthRisk();
    }
}
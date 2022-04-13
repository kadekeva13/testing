package com.example.myapplication;

import android.util.Log;

class QuestionBank {

    public String mQuestions[] = {
            "Apakah sejak kejadian itu sering sulit tidur?",
            "Apakah waktu tidurmu berkurang?",
            "Apakah kamu bisa tidur nyenyak?",
    };

    private String mChoices[][] = {
            {"Tidur saya tidak terganggu", "Tidur saya telat dari biasanya", "Saya tidak bisa tidur sampai larut malam"},
            {"Jam tidur saya tidak berkurang", "Jam tidur saya berkurang 1 jam dari sebelumnya", "Saya baru bisa tidur saat subuh"},
            {"Saya bisa tidur nyenyak", "Perlu pendamping untuk bisa tidur nyenyak", "Setiap hari saya tidak bisa tidur nyenyak"},
    };

    private String mCorrectAnswer[] = {
            "Tidur saya tidak terganggu",
            "Jam tidur saya tidak berkurang",
            "Saya bisa tidur nyenyak",
    };

    private String mResults[][] = {
            {"Anak tetap bermain dengan teman", "Anak dapat bercerita dengan teman disekitarnya", "Anak dapat melakukan kegiatan yang disukainya"},
            {"Psikolog memberikan edukasi pendampingan ..."},
            {"Psikolog melakukan konseling ... "},
    };

    public int getLength() {
        return mQuestions.length;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice(int a, int num) {
        String choice = mChoices[a][num-1];
        return choice;
    }

    public String getCorrectionAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }

    public String getConclusion(float num) {
        Log.d("QuestNum", String.valueOf(num));
        String conclusion = "";
        if (num >= 0.7) {
            conclusion = "ringan";
        } else if (num >= 0.5) {
            conclusion = "sedang";
        } else if (num >= 0.25) {
            conclusion = "berat";
        } else {
            conclusion = "berat";
        }
        return conclusion;
    }

    public String[] getResult(String conclusion) {
        String[] result = new String[0];
        if (conclusion.equals("ringan")) {
            result = mResults[0];
        } else if (conclusion.equals("sedang")) {
            result = mResults[1];
        } else if (conclusion.equals("berat")) {
            result = mResults[2];
        }
        return result;
    }
}

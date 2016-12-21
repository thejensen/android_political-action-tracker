package com.epicodus.politicalactiontracker;

/**
 * Created by jensese on 12/20/16.
 */

public class Action {
    public static String[] name = new String[]{"Race for our Rights 5K", "RAIN International's Concert for Unity", "Letters to the Editor - East Side"};
    public static String[] location = new String[]{"Portland, OR", "Portland, OR", "Portland, OR"};
    public static String[] link = new String[]{"https://endurancecui.active.com/new/events/40289154/priceCategories/40278951/primaryForm?_p=6128281555138528","https://www.eventbrite.com/e/rain-internationals-concert-for-unity-tickets-29617140665?aff=efbnreg", "https://www.meetup.com/Pantsuit-Nation-Portland/events/236199507/"};
    public static String[] date = new String[]{"01/20/17","12/30/16", "01/04/16"};
    public static String[] description = new String[]{"Like many of you, I am deeply angered and motivated by the message our country sent to women on Tuesday. This inauguration day, women will rise. I have reserved Magnuson Park (on January 20th) to host a RACE FOR OUR RIGHTS fivek (fun run/walk). All proceeds from this race will go directly to Planned Parenthood. Register here for $20: https://endurancecui.active.com/new/events/40289154/priceCategories/40278951/primaryForm?_p=6128281555138528 Donate to the GoFundMe here: https://www.gofundme.com/race-for-our-rights I am acting in my capacity as a community member, not affiliated with any organization.","Celebrate an evening of unity, diversity and solidarity at Refugee Assistance and Information Network's benefit concert!", "One of the arms of civic engagement is our relationship to the media. The media was a powerful tool in this last election and we will discuss our role in connecting with our local and national media sources. This first workshop will discuss print media, its political power, and how we can use it to express our opinions and values. We will provide content topics, such as current local protest events, the president elect's conflicts of interest, etc. Please feel free to show up unprepared or, if you have a burning topic that you'd like to articulate to our local press, please bring that with you and feel free to message us ahead of time with it. What to bring: • laptop • paper and pen • your convictions, values, experience, thoughts and feelings. We look forward to hearing your voices. Please RSVP on the Pantsuit Nation Portland Meetup page",};
    public static int[] resourceIds = new int[]{R.drawable.fivek, R.drawable.rainconcert, R.drawable.pantsuitnation, };
    public static String[] categoryCause = new String[]{"Women's Rights", "Diversity", "Media", };
    public static String[] categoryAction = new String[]{"Fundraiser", "Fundraiser", "Writing"};
    public static int[] price = new int[]{25, 0, 20};
    public static String[] iDidThis = new String[]{"I did this!", "I did this!", "I did this!"};
    public static int[] impactAssessment = new int[]{3, 4, 2,};

}

//public class Action {
//    private String mName;
//    private String mLocation;
//    private String mLink;
//    private String mDate;
//    private String mDescription;
//    private int mResourceIds;
//    private String mCategoryCause;
//    private String mCategoryAction;
//    private int mPrice;
//    private String mIDidThis;
//
//    public Action(String mName, String mLocation, String mLink, String mDate, String mDescription, int mResourceIds, String mCategoryCause, String mCategoryAction, int mPrice, String mIDidThis, int mImpactAssessment) {
//        this.mName = mName;
//        this.mLocation = mLocation;
//        this.mLink = mLink;
//        this.mDate = mDate;
//        this.mDescription = mDescription;
//        this.mResourceIds = mResourceIds;
//        this.mCategoryCause = mCategoryCause;
//        this.mCategoryAction = mCategoryAction;
//        this.mPrice = mPrice;
//    }
//
//    public String getName() {
//        return mName;
//    }
//
//    public String getLocation() {
//        return mLocation;
//    }
//
//    public String getLink() {
//        return mLink;
//    }
//
//    public String getDate() {
//        return mDate;
//    }
//
//    public String getDescription() {
//        return mDescription;
//    }
//
//    public int getResourceIds() {
//        return mResourceIds;
//    }
//
//    public String getCategoryCause() {
//        return mCategoryCause;
//    }
//
//    public String getCategoryAction() {
//        return mCategoryAction;
//    }
//
//    public int getPrice() {
//        return mPrice;
//    }
//
//    public String getIDidThis() {
//        return mIDidThis;
//    }

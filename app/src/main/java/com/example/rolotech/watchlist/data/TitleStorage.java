package com.example.rolotech.watchlist.data;

import com.example.rolotech.watchlist.models.Title;
import com.example.rolotech.watchlist.persistence.AppDatabase;

import java.util.ArrayList;

import static com.example.rolotech.watchlist.WatchListApp.getAppContext;

/**
 * Created by RoLoTech on 26/01/2020.
 */

public class TitleStorage {
    public static ArrayList<Title> titlesStored = new ArrayList<>();
    static AppDatabase db = AppDatabase.getAppDatabase(getAppContext());
    public static void initTitles() {
        db.titleDao().insertAll(new Title("Titans", null, null));
        db.titleDao().insertAll(new Title("Sex Education", null, null));
        db.titleDao().insertAll(new Title("Peaky Blinders", null, null));
        db.titleDao().insertAll(new Title("You", null, null));
        db.titleDao().insertAll(new Title("The Blacklist", null, null));
        db.titleDao().insertAll(new Title("Blindspot", null, null));
        db.titleDao().insertAll(new Title("Merlí", null, null));
        db.titleDao().insertAll(new Title("Black Mirror", null, null));
        db.titleDao().insertAll(new Title("Sherlock", null, null));
        db.titleDao().insertAll(new Title("Arrow", null, null));
        db.titleDao().insertAll(new Title("Breaking Bad", null, null));
        db.titleDao().insertAll(new Title("The Flash", null, null));
        db.titleDao().insertAll(new Title("La casa de papel", null, null));
        db.titleDao().insertAll(new Title("Sense8", null, null));
        db.titleDao().insertAll(new Title("How to sell drugs online (fast)", null, null));
        db.titleDao().insertAll(new Title("Salvation", null, null));
        db.titleDao().insertAll(new Title("The End of the F***ing World", null, null));
        db.titleDao().insertAll(new Title("Stranger Things", null, null));
        db.titleDao().insertAll(new Title("The Innocents", null, null));
        db.titleDao().insertAll(new Title("Altamar", null, null));
//        titlesStored.add(new Title("Titans", null, null));
//        titlesStored.add(new Title("Sex Education", null, null));
//        titlesStored.add(new Title("Peaky Blinders", null, null));
//        titlesStored.add(new Title("You", null, null));
//        titlesStored.add(new Title("The Blacklist", null, null));
//        titlesStored.add(new Title("Blindspot", null, null));
//        titlesStored.add(new Title("Merlí", null, null));
//        titlesStored.add(new Title("Black Mirror", null, null));
//        titlesStored.add(new Title("Sherlock", null, null));
//        titlesStored.add(new Title("Arrow", null, null));
//        titlesStored.add(new Title("Breaking Bad", null, null));
//        titlesStored.add(new Title("The Flash", null, null));
//        titlesStored.add(new Title("La casa de papel", null, null));
//        titlesStored.add(new Title("Sense8", null, null));
//        titlesStored.add(new Title("How to sell drugs online (fast)", null, null));
//        titlesStored.add(new Title("Salvation", null, null));
//        titlesStored.add(new Title("The End of the F***ing World", null, null));
//        titlesStored.add(new Title("Stranger Things", null, null));
//        titlesStored.add(new Title("The Innocents", null, null));
//        titlesStored.add(new Title("Altamar", null, null));

    }
}

package com.example.androidnotes;

import androidx.cardview.widget.CardView;

import com.example.androidnotes.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void  onLongClick(Notes notes, CardView cardView);

}

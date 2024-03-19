package com.example.wordbook.vocalist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/wordbook/vocalist/VocaListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lcom/example/wordbook/repository/WordRepository;", "vocas", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/wordbook/database/Word;", "getVocas", "()Landroidx/lifecycle/MutableLiveData;", "getAllWords", "", "searchWords", "query", "", "app_debug"})
public final class VocaListViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.wordbook.repository.WordRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.wordbook.database.Word>> vocas = null;
    
    public VocaListViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.wordbook.database.Word>> getVocas() {
        return null;
    }
    
    public final void searchWords(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    private final void getAllWords() {
    }
}
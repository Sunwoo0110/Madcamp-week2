package com.example.Front;

import android.content.res.AssetManager;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.google.gson.Gson;

public class ReviewFragment extends Fragment {

    private RecyclerView reRecyclerView;
    private ResInfoAdapter reAdapter;
    private RecyclerView.LayoutManager reLayoutManager;
    private ArrayList<ResData> reResData = new ArrayList<ResData>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_res_info_list, container, false);
        reRecyclerView = (RecyclerView) view.findViewById(R.id.res_list);
        reRecyclerView.setHasFixedSize(true);
        reLayoutManager = new LinearLayoutManager(getActivity());
        reRecyclerView.setLayoutManager(reLayoutManager);
        reRecyclerView.scrollToPosition(0);
        reAdapter = new ResInfoAdapter(reResData, getActivity());
        reRecyclerView.setAdapter(reAdapter);
        reRecyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }}
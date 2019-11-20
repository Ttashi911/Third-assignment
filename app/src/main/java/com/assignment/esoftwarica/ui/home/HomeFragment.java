package com.assignment.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.assignment.esoftwarica.R;
import com.assignment.esoftwarica.adapter.StudentsAdapter;
import com.assignment.esoftwarica.model.Students;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerViewHome;
    private static List<Students> studentsList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewHome = root.findViewById(R.id.recyclerViewHome);

        Students students = new Students("admin", "tokha", "Male", "50",R.drawable.noimg);
        studentsList = students.getStudentsList();
        if (studentsList.isEmpty()){
            studentsList.add(new Students("shrishak shrestha", "tokha", "Male", "22", R.drawable.maleimg));
            studentsList.add(new Students("Anisha Shrestha", "tokha", "Female", "20", R.drawable.femaleimg));
            students.setStudentsList(studentsList);
        }
        StudentsAdapter studentsAdapter = new StudentsAdapter(getActivity(), studentsList);
        recyclerViewHome.setAdapter(studentsAdapter);
        recyclerViewHome.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        return root;
    }
}
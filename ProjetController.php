<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ProjetController extends Controller
{
    public function index(){
        return view('projet.index');
    }
    public function services(){
        return view('projet.services');
    }
    public function about(){
        return view('projet.about');
    }
    public function details(){
        return view('projet.services-details');
    }
    public function precing(){
        return view('projet.precing');
    }
    public function contact(){
        return view('projet.contact');
    }
}

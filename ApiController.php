<?php

namespace App\Http\Controllers;

use App\Models\Commande;
use Illuminate\Http\Request;

class ApiController extends Controller
{
    public function store(Request $request)
{
   
    $validated = $request->validate([
        'nom' => 'required|string',
        'telephone' => 'required|string',
        'refference' => 'required|string',
        'article' => 'required|string',
        'description' => 'required|string',
        'pu' => 'required|string',
        'qte' => 'required|integer',
        'pt' => 'required|string',
        'nature' => 'required|string',
        'date' => 'required|date',
    ]);

    
    $order = Commande::create($validated);

    return response()->json(['message' => 'Commande créée avec succès', 'order' => $order], 201);
}

}

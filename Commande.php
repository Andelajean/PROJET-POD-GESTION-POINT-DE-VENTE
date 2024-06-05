<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Commande extends Model
{
    use HasFactory;
    protected $fillable = [
        'nom',
        'telephone',
        'refference',
        'article',
        'description',
        'pu',
        'qte',
        'pt',
        'nature',
        'date',
    ];
}

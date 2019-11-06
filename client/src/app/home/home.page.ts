import { Component, OnInit } from '@angular/core';
import { IUsuario } from './../interfaces/IUsuario';
import { UsuarioService } from './../services/usuario.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage{

  items:Array<IUsuario> = [];

  constructor(private usuarioService:UsuarioService, private router:Router) {}

  ionViewWillEnter(){
    this.usuarioService.findAll().subscribe(resp=>{
        this.items = resp;
    })
  }

  listar(){
    this.usuarioService.findAll().subscribe(resp=>{
      this.items = resp;
    });
    console.log("ssss");
  }
  update(id:number){
    this.router.navigate(["edit", id]);
  }

  create(){
    this.router.navigate(["create"]);
  }

  delete(IDPER:number){
    this.usuarioService.delete(IDPER).subscribe((resp)=>{
      this.listar();
    });
  }

}

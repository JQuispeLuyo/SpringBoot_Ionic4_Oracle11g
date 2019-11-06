import { Component, OnInit } from '@angular/core';
import { UsuarioService } from '../services/usuario.service';
import { IUsuario } from '../interfaces/IUsuario';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.page.html',
  styleUrls: ['./create.page.scss'],
})
export class CreatePage implements OnInit {

  usuario:IUsuario = new IUsuario();

  constructor(private route:Router, private usuarioService:UsuarioService) { }

  ngOnInit() {
  }

  create(){
    this.usuarioService.create(this.usuario).subscribe(resp=>{
      console.log(resp)
      this.route.navigate(['home']);
    })
  }

}

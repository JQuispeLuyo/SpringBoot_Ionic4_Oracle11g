import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IUsuario } from './../interfaces/IUsuario';
@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private http: HttpClient) { }

  findAll(): Observable<IUsuario[]> {
    return this.http.get<IUsuario[]>("http://localhost:8989/usuario");
  }


  findId(id: number): Observable<IUsuario> {
    return this.http.get<IUsuario>(`http://localhost:8989/usuario/${id}`);
  }

  create(usuario: IUsuario): Observable<IUsuario> {
    return this.http.post<IUsuario>("http://localhost:8989/usuario/", usuario);
  }

  update(usuario: IUsuario): Observable<IUsuario> {
    return this.http.put<IUsuario>("http://localhost:8989/usuario/", usuario);
  }

  delete(id): Observable<IUsuario> {
    return this.http.delete<IUsuario>(`http://localhost:8989/usuario/${id}`);
  }

}

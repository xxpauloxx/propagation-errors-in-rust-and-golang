fn divide(a: f64, b: f64) -> Result<f64, String> {
    if b == 0.0 {
        return Err("Divisão por zero não é permitida".to_string());
    }
    Ok(a / b)
}

fn main() {
    // Chamada da função divide com tratamento de erro.
    match divide(10.0, 0.0) {
        Ok(resultado) => println!("Resultado: {}", resultado),
        Err(erro) => println!("Erro: {}", erro),
    }

    // Chamada bem-sucedida.
    match divide(10.0, 2.0) {
        Ok(resultado) => println!("Resultado: {}", resultado),
        Err(erro) => println!("Erro: {}", erro),
    }
}

use rand::seq::SliceRandom;
use rand::thread_rng;
use std::collections::HashSet;

fn generate_code() -> Vec<String> {
    let allowed_chars: &str = "2346789BCDFGHJKMNPQRTVWXYZ";
    let mut codes: HashSet<String> = HashSet::new();
    let mut rng = thread_rng();

    while codes.len() < 25 {
        let code: String = (0..4)
            .map(|_| {
                (0..5)
                    .map(|_| allowed_chars.choose(&mut rng).unwrap())
                    .collect::<String>()
            })
            .collect::<Vec<_>>()
            .join("-")
            + "-"
            + &(0..4)
                .map(|_| allowed_chars.choose(&mut rng).unwrap())
                .collect::<String>()
            + "Z";
        codes.insert(code);
    }

    codes.into_iter().collect()
}

fn main() {
    for code in generate_code() {
        println!("{}", code);
    }
}

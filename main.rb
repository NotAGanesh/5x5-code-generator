r
require 'securerandom'

def generate_code
  allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ"
  codes = []

  25.times do  # Generate 25 codes
    code = (1..4).map { SecureRandom.random_bytes(5).tr("\x00-\x7F", allowed_chars).chars.sample(5).join }.join("-") + "-" + SecureRandom.random_bytes(4).tr("\x00-\x7F", allowed_chars).chars.sample(4).join + "Z"
    codes << code
  end

  codes
end

# Generate and print 25 codes
generate_code.each { |code| puts code }


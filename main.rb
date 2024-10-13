def generate_code
  allowed_chars = "2346789BCDFGHJKMNPQRTVWXYZ"
  codes = []

  while codes.length < 25  # Generate 25 codes
    code_parts = []

    # Generate the first four parts with 5 characters each
    4.times do
      part = ""
      5.times do
        part += allowed_chars[rand(allowed_chars.length)]
      end
      code_parts << part
    end

    # Generate the last part with 4 characters and append 'Z'
    last_part = ""
    4.times do
      last_part += allowed_chars[rand(allowed_chars.length)]
    end
    last_part += "Z"

    # Join all parts together
    code = code_parts.join("-") + "-" + last_part

    # Check for three consecutive repeated characters
    valid = true
    (0..(code.length - 7)).each do |i|
      if code[i, 3] == code[i + 3, 3]
        valid = false
        break
      end
    end

    # If valid, add to the list of codes
    codes << code if valid
  end

  codes
end

# Generate and print 25 codes
generate_code.each do |code|
  puts code
end

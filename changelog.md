# v1.3 - UI/UX Update
### Site Fixes
- Fixed a issue reproduces when site will open on phone
- Fixed broken grid of the site
- Fixed broken alignment

### Site UI Changes
- Rework on glassmorphism effect
- Added new clipboard box on bottom right
- Font has been changed to **Poppins**
- Rework on theme toggle button
  - Added Oled Theme 
- Renamed **MCE Style Cape By @Rddff123** with **MCE Style**


### Site Removed things
- Removed **Educational Purpose Only** sign on top

### Site Logic
- Code Generator Source Code has been Compressed

# v1.2 - MCE Style Code Generator Update
- added MCE Cape Style Codes by @Rddff123 / #1
- added a option selection button

## 🤔 What is difference in MCE Style Codes?

### **Key Differences:**

1. **Starting Character:**
   - **First Code:** Always starts with the digit `2`.  
     Example: `2ABCD-ABCDE-FGHIJ-KLMNO-PQRSZ`
   - **Second Code:** Does **not** enforce a specific starting character; any valid character can appear at the start.  
     Example: `ABCDEF-GHIJK-LMNOP-QRSTU-VWXYQZ`

##

2. **Length of Each Segment:**
   - **First Code:** Starts with one character (`2`), followed by 4 characters, then 5-character segments separated by dashes, and ends with a 4-character segment + `Z`.  
     Pattern: `2xxxx-xxxxx-xxxxx-xxxxx-xxxxZ`
   - **Second Code:** Consists of four 5-character segments separated by dashes, ending with a 4-character segment + `Z`.  
     Pattern: `xxxxx-xxxxx-xxxxx-xxxxx-xxxxZ`

##

3. **Allowed Characters:**
   - Both codes use the same character set: `"2346789BCDFGHJKMNPQRTVWXYZ"`.  
     Excludes: `A, E, I, L, O, S, U, 0, 1, 5`.

##

4. **Validation for Repeated Characters:**
   - **First Code:** Ensures no three consecutive characters repeat anywhere in the code.  
   - **Second Code:** Also ensures no three consecutive characters repeat but uses a slightly different implementation.

##

5. **Code Structure Flexibility:**
   - **First Code:** Fixed starting digit (`2`) makes codes less flexible but predictable.  
   - **Second Code:** Flexible starting character allows more diverse codes.

##

### **Summary of Outputs:**

- **First Code:** Will always generate codes starting with `2` and has a fixed segment pattern (`2xxxx-xxxxx-xxxxx-xxxxx-xxxxZ`).  
- **Second Code:** Generates codes with a flexible starting character and a simpler pattern (`xxxxx-xxxxx-xxxxx-xxxxx-xxxxZ`).




## New Code Examples 

248M7-4B2Y6-GCD67-WGG6W-MF8NZ
22TVY-9X4JD-DP4QV-ZZ6RD-MM4WZ
2BYDH-KVDBN-6PTPX-GVTQT-ZWMWZ
2FKQF-Z7N7X-WKHTZ-KQ9GM-C276Z

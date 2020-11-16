var
a,b,c: double;
begin
   read(a);
   
   if((a >= 0.00) and (a <= 2000.00))then
   begin
      writeln('Isento');
   end
   else if((a >= 2000.01) and (a <= 3000.00))then
   begin
      b := a - 2000;
      c := b * 0.08;
      writeln('R$ ', c:-1:2);
   end
   else if((a >= 3000.01) and (a <= 4500.00))then
   begin
      b := a - 3000;
      c := b * 0.18 + 1000 * 0.08;
      writeln('R$ ', c:-1:2);
   end
   else if(a > 4500.00)then
   begin
      b := a - 4500;
      c := b * 0.28 + 1500 * 0.18 + 1000 * 0.08;
      writeln('R$ ', c:-1:2);
   end
end.

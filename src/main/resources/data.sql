delete from Ingredient_Ref;
delete from Shawarma;
delete from Shawarma_Order;
delete from Ingredient;

insert into Ingredient (id, name, type) values  ('CLSH', 'Cheese Lavash', 'LAVASH');
insert into Ingredient (id, name, type) values   ('ULSH', 'Lavash', 'LAVASH');
insert into Ingredient (id, name, type) values  ('GRBF', 'Ground Beef', 'PROTEIN');
insert into Ingredient (id, name, type) values  ('LAMB', 'Lamb Meet','PROTEIN');
insert into Ingredient (id, name, type) values  ('CCMR', 'Cucumber', 'VEGGIES');
insert into Ingredient (id, name, type) values  ('TMTS', 'Tomatoes', 'VEGGIES');
insert into Ingredient (id, name, type) values  ('LETC', 'Lettuce', 'VEGGIES');
insert into Ingredient (id, name, type) values  ('CHED', 'Cheddar', 'CHEESE');
insert into Ingredient (id, name, type) values   ('ADYG', 'Adyghe Cheese', 'CHEESE');
insert into Ingredient (id, name, type) values   ('MYNS', 'Mayonnaise', 'SAUCE');
insert into Ingredient (id, name, type) values   ('HCHL', 'Hot Chili Sauce', 'SAUCE');
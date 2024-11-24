-- Add categories
INSERT INTO categories(id, name, url) VALUES (1, 'Bags','/images/categories/bags/dog-bags.jpg');
INSERT INTO categories(id, name, url) VALUES (2, 'Beds', '/images/categories/beds/dog-beds.jpg');
INSERT INTO categories(id, name, url) VALUES (3, 'Bowls', '/images/categories/bowls/dog-bowls.jpg');
INSERT INTO categories(id, name, url) VALUES (4, 'Clothes', '/images/categories/clothes/dog-clothes.jpg');
INSERT INTO categories(id, name, url) VALUES (5, 'Combs', '/images/categories/combs/dog-combs.jpg');
INSERT INTO categories(id, name, url) VALUES (6, 'Jewelry', '/images/categories/jewelry/dog-jewelry.jpg');
INSERT INTO categories(id, name, url) VALUES (7, 'Leashes', '/images/categories/leashes/dog-leashes.jpg');
INSERT INTO categories(id, name, url) VALUES (8, 'Toys', '/images/categories/toys/dog-toys.jpg');

-- Add user roles
INSERT INTO user_roles(id, user_role) VALUES (1, 'ADMIN');
INSERT INTO user_roles(id, user_role) VALUES (2, 'MODERATOR');
INSERT INTO user_roles(id, user_role) VALUES (3, 'CLIENT');

